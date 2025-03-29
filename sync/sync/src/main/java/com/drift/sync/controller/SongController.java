package com.drift.sync.controller;

import com.drift.sync.model.Song;
import com.drift.sync.service.PlaylistService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SongController {

    private final PlaylistService playlistService;

    public SongController(PlaylistService playlistService) {
        this.playlistService = playlistService;
    }

    @GetMapping("/playlist")
    public List<Song> getPlaylist(@RequestParam String mood) {
        return playlistService.getPlaylistByMood(mood);
    }
}
