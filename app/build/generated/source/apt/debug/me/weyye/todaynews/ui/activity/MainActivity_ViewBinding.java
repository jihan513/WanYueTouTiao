// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.flContent = Utils.findRequiredViewAsType(source, R.id.fl_content, "field 'flContent'", FrameLayout.class);
    target.llBottom = Utils.findRequiredViewAsType(source, R.id.llBottom, "field 'llBottom'", LinearLayout.class);
    target.ivIconHome = Utils.findRequiredViewAsType(source, R.id.ivIconHome, "field 'ivIconHome'", ImageView.class);
    target.tvTextHome = Utils.findRequiredViewAsType(source, R.id.tvTextHome, "field 'tvTextHome'", TextView.class);
    target.tvBadgeHome = Utils.findRequiredViewAsType(source, R.id.tvBadgeHome, "field 'tvBadgeHome'", TextView.class);
    target.ivIconVideo = Utils.findRequiredViewAsType(source, R.id.ivIconVideo, "field 'ivIconVideo'", ImageView.class);
    target.tvTextVideo = Utils.findRequiredViewAsType(source, R.id.tvTextVideo, "field 'tvTextVideo'", TextView.class);
    target.ivIconAttention = Utils.findRequiredViewAsType(source, R.id.ivIconAttention, "field 'ivIconAttention'", ImageView.class);
    target.tvTextAttention = Utils.findRequiredViewAsType(source, R.id.tvTextAttention, "field 'tvTextAttention'", TextView.class);
    target.ivIconMe = Utils.findRequiredViewAsType(source, R.id.ivIconMe, "field 'ivIconMe'", ImageView.class);
    target.tvTextMe = Utils.findRequiredViewAsType(source, R.id.tvTextMe, "field 'tvTextMe'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.flContent = null;
    target.llBottom = null;
    target.ivIconHome = null;
    target.tvTextHome = null;
    target.tvBadgeHome = null;
    target.ivIconVideo = null;
    target.tvTextVideo = null;
    target.ivIconAttention = null;
    target.tvTextAttention = null;
    target.ivIconMe = null;
    target.tvTextMe = null;

    this.target = null;
  }
}
