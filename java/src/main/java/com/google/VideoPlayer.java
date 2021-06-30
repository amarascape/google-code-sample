package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VideoPlayer {

  private final VideoLibrary videoLibrary;

  private String videoPlaying;

  public VideoPlayer() {
    this.videoLibrary = new VideoLibrary();

    videoPlaying = "";
  }

  public void numberOfVideos() {
    System.out.printf("%s videos in the library%n", videoLibrary.getVideos().size());
  }

  /**
   * This command will list all available videos in the format: “title (video_id) [tags]”.
   * The videos should be shown in lexicographical order by title. If there are no tags available, display empty brackets.
   */
  public void showAllVideos() {
    ArrayList<Video> videos = (ArrayList<Video>) videoLibrary.getVideos();
    Collections.sort(videos, new VideoTitleComparator());
    for(Video video: videos){
      System.out.println(video);
    }
  }

  /**
   * Comparator class to sort ArrayList of Videos by title alphabetically
   * Used in the showAllVideos() method
   */
  class VideoTitleComparator implements Comparator {
    public int compare(Object o1,Object o2){
      Video video1=(Video)o1;
      Video video2=(Video)o2;

      return video1.getTitle().compareTo(video2.getTitle());
    }
  }

  public void playVideo(String videoId) {
    if((videoLibrary.getVideo(videoId)) == null){
      System.out.println("Cannot play video: Video does not exist");
    }
    else{
      stopCurrentVideo();
      videoPlaying = videoLibrary.getVideo(videoId).getTitle();
      System.out.println("Playing video: " + videoPlaying);
    }
  }

  /**
   * Checks if there is currently a video playing.
   * If true, displays a note that this video will be
   * stopped.
   */
  private void stopCurrentVideo(){
    if(videoPlaying.length() == 0){
      //there is no video currently playing
    }
    else{
      System.out.println("Stopping video: " + videoPlaying);
    }
  }

  public void stopVideo() {
    System.out.println("stopVideo needs implementation");
  }

  public void playRandomVideo() {
    System.out.println("playRandomVideo needs implementation");
  }

  public void pauseVideo() {
    System.out.println("pauseVideo needs implementation");
  }

  public void continueVideo() {
    System.out.println("continueVideo needs implementation");
  }

  public void showPlaying() {
    System.out.println("showPlaying needs implementation");
  }

  public void createPlaylist(String playlistName) {
    System.out.println("createPlaylist needs implementation");
  }

  public void addVideoToPlaylist(String playlistName, String videoId) {
    System.out.println("addVideoToPlaylist needs implementation");
  }

  public void showAllPlaylists() {
    System.out.println("showAllPlaylists needs implementation");
  }

  public void showPlaylist(String playlistName) {
    System.out.println("showPlaylist needs implementation");
  }

  public void removeFromPlaylist(String playlistName, String videoId) {
    System.out.println("removeFromPlaylist needs implementation");
  }

  public void clearPlaylist(String playlistName) {
    System.out.println("clearPlaylist needs implementation");
  }

  public void deletePlaylist(String playlistName) {
    System.out.println("deletePlaylist needs implementation");
  }

  public void searchVideos(String searchTerm) {
    System.out.println("searchVideos needs implementation");
  }

  public void searchVideosWithTag(String videoTag) {
    System.out.println("searchVideosWithTag needs implementation");
  }

  public void flagVideo(String videoId) {
    System.out.println("flagVideo needs implementation");
  }

  public void flagVideo(String videoId, String reason) {
    System.out.println("flagVideo needs implementation");
  }

  public void allowVideo(String videoId) {
    System.out.println("allowVideo needs implementation");
  }
}