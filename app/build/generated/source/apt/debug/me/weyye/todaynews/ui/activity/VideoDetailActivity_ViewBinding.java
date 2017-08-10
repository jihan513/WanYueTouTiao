// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.activity;

import android.support.annotation.UiThread;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.Override;
import me.weyye.todaynews.R;
import me.weyye.todaynews.ui.view.EasyJCVideoPlayer;

public class VideoDetailActivity_ViewBinding<T extends VideoDetailActivity> extends BaseNewsActivity_ViewBinding<T> {
  @UiThread
  public VideoDetailActivity_ViewBinding(T target, View source) {
    super(target, source);

    target.mVideoPlayer = Utils.findRequiredViewAsType(source, R.id.videoPlayer, "field 'mVideoPlayer'", EasyJCVideoPlayer.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.mVideoPlayer = null;
  }
}
