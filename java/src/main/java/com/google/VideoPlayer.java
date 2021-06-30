package com.google;

import java.util.*;

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
    if(videos.size() > 0){
      System.out.println("Here's a list of all available videos:");
      Collections.sort(videos, new VideoTitleComparator());
      for(Video video: videos){
        System.out.println(video);
      }
    }
    else{
      System.out.println("No videos available");
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

  /**
   * Play the specified video. If a video is currently playing, display a note that this video will be
   * stopped, even if the same video is already playing. If the video doesn’t exist, display a warning
   * message (and don’t stop the currently playing video).
   * @param videoId the specified video
   */
  public void playVideo(String videoId) {
    if((videoLibrary.getVideo(videoId)) == null){
      System.out.println("Cannot play video: Video does not exist");
    }
    else{
      if(videoPlaying.length() > 0){
        stopVideo();
      }
      videoPlaying = videoLibrary.getVideo(videoId).getTitle();
      System.out.println("Playing video: " + videoPlaying);
    }
  }

  /**
   * Stop the current playing video.
   * If no video is currently playing, display a warning message
   * “Cannot stop video: No video is currently playing” and do nothing.
   */
  public void stopVideo() {
    if(videoPlaying.length() == 0){
      System.out.println("Cannot stop video: No video is currently playing");
    }
    else{
      System.out.println("Stopping video: " + videoPlaying);
      videoPlaying = "";
    }
  }

  /**
   * Play a random video. If a video is currently playing, display a note that this video will be stopped,
   * even if the same video is already playing.
   * If there are no videos available, print out “No videos available”
   */
  public void playRandomVideo() {
    ArrayList<Video> videos = (ArrayList<Video>) videoLibrary.getVideos();
    if(videos.size() > 0){
      Random rand = new Random();
      int randIndex = rand.nextInt(videos.size());
      playVideo(videos.get(randIndex).getVideoId());
    }
    else{
      System.out.println("No videos available");
    }

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