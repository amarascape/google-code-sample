package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** A class used to represent a video. */
class Video {

  private final String title;
  private final String videoId;
  private final List<String> tags;

  Video(String title, String videoId, List<String> tags) {
    this.title = title;
    this.videoId = videoId;
    this.tags = Collections.unmodifiableList(tags);
  }

  /** Returns the title of the video. */
  String getTitle() {
    return title;
  }

  /** Returns the video id of the video. */
  String getVideoId() {
    return videoId;
  }

  /** Returns a readonly collection of the tags of the video. */
  List<String> getTags() {
    return tags;
  }

  /**
   * Overrides the toString method to show videos in the format:
   * title (video_id) [tags]
   * Used in the SHOW_ALL_VIDEOS command
   * @return
   */
  @Override
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(title + " ");
    stringBuilder.append("(" + videoId + ") ");
    if(tags.size() > 0) {
      stringBuilder.append("[");
      for (String tag : tags) {
        stringBuilder.append(tag + " ");
      }
      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
      stringBuilder.append("]");
    }
    else{
      stringBuilder.append("[]");
    }
    return stringBuilder.toString();
  }
}
