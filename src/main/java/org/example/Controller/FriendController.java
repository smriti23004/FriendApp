package org.example.Controller;

import lombok.RequiredArgsConstructor;
import org.example.Model.Friend;
import org.example.Repository.FriendRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

//This marks the class as Controller where every method returns in JSON data
//instead of view
@RestController

//constructor for Final fields , created by lombok
@RequiredArgsConstructor
public class FriendController {

    private final FriendRepository repository;
    private final RestTemplate restTemplate;

    //this endpoint handles saving new data
    @PostMapping("/friend")
    public  String  addFriend(@RequestBody Friend friend){

        // Save the incoming JSON data into our H2 database.
        Friend savedFriend = repository.save(friend);
       //create a URL string that points back to our own server's second endpoint.
        String confirmationUrl = "http://localhost:8080/crud/confirm/" + savedFriend.getId();
        // It waits for the response from confirmEntry() and returns that string to the user.
        return restTemplate.getForObject(confirmationUrl, String.class);
    }

    //this endpoint looks in the database for the entry and returns confirmation
    @GetMapping("/crud/confirm/{id}")
    public String confirmEntry(@PathVariable Long id) {
        return repository.findById(id)
                .map(f -> "CONFIRMED: [" + f.getName() + "] is safely stored in H2.")
                .orElse("DENIED: ID " + id + " does not exist.");
    }

}
