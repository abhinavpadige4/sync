
package com.drift.sync.service;

import com.drift.sync.model.Song;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PlaylistService {

    private final Map<String, List<Song>> moodSongs;

    public PlaylistService() {
        moodSongs = new HashMap<>();
        moodSongs.put("happy", Arrays.asList(
                new Song("Happy", "Pharrell Williams", "https://example.com/happy.mp3"),
                new Song("Uptown Funk", "Bruno Mars", "https://example.com/uptownfunk.mp3")
        ));
        moodSongs.put("sad", Arrays.asList(
                new Song("Someone Like You", "Adele", "https://example.com/adele.mp3"),
                new Song("Let Her Go", "Passenger", "https://example.com/passenger.mp3")
        ));
    }

    public List<Song> getPlaylistByMood(String mood) {
        return moodSongs.getOrDefault(mood.toLowerCase(), Collections.emptyList());
    }
}
