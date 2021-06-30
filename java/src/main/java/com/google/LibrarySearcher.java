package com.google;

import java.util.ArrayList;

public class LibrarySearcher {

    private VideoLibrary videoLibrary;

    public LibrarySearcher() {
        videoLibrary = new VideoLibrary();
    }

    /**
     *
     * @param searchTerm
     * @return an ArrayList of Video objects that match the searchTerm
     */
    public ArrayList<Video> searchByTitle(String searchTerm){
        ArrayList<Video> videos = (ArrayList<Video>) videoLibrary.getVideos();
        ArrayList<Video> searchResults = new ArrayList<>();
        for(Video video: videos){
            if(video.getTitle().toLowerCase().contains(searchTerm.toLowerCase().trim())){
                searchResults.add(video);
            }
        }
        return searchResults;
    }
}
