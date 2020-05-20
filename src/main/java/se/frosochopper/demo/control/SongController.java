package se.frosochopper.demo.control;

import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@RestController
@RequestMapping(path = "/api/v1/songs")
public class SongController {

    @GetMapping("/ping")
    public String ping() { return "Pong"; }
    
    @GetMapping("/")
    public ArrayList<String> getAll(){
        // TODO: Swop String to SongModel when it exists
        // TODO: implement songService
        // return songService.getAll();
        
        //Temp mock
        ArrayList<String> songs = new ArrayList<String>();
        songs.add("Fly me to the moon");
        songs.add("Star man");
        return songs;
    }

    @GetMapping("/{id}")
    public String getMessageModel(@PathVariable("id") int id){
        // TODO: Swop String to SongModel when it exists
        // TODO: implement songService
        // return songService.getMessageModel(id);
        
        // Temp mock
        String song = "";
        switch(id) {
          case 1:
            song = "Fly me to the moon";
            break;
          case 2:
            song = "Starman";
            break;
          default:
            song = "No song found";
        }
        return song;
    }
}
