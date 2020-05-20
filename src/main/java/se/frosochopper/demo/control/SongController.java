package se.frosochopper.demo.control;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/songs")
public class SongController {

    @GetMapping("/ping")
    public String ping() { return "Pong"; }
}
