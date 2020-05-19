package se.frosochopper.demo.control;

@RestController
@RequestMapping(path = "/api/v1/songs")
public class SongController {

    @GetMapping("/ping")
    public String ping() { return "Pong"; }
}
