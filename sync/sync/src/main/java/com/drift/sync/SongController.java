package com.drift.sync;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SongController {

    @GetMapping("/songs")
    public String getSongs() {
        return "Songs list";
    }
}
