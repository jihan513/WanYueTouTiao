// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;

public class SplashActivity_ViewBinding<T extends SplashActivity> implements Unbinder {
  protected T target;

  private View view2131624232;

  @UiThread
  public SplashActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mBannerView = Utils.findRequiredViewAsType(source, R.id.banner_view, "field 'mBannerView'", ImageView.class);
    target.mSplashView = Utils.findRequiredViewAsType(source, R.id.splash_view, "field 'mSplashView'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.skip_real, "field 'mSkipReal' and method 'onClick'");
    target.mSkipReal = Utils.castView(view, R.id.skip_real, "field 'mSkipReal'", TextView.class);
    view2131624232 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mGuideFragment = Utils.findRequiredViewAsType(source, R.id.guide_fragment, "field 'mGuideFragment'", FrameLayout.class);
    target.mAdClickSmall = Utils.findRequiredViewAsType(source, R.id.ad_click_small, "field 'mAdClickSmall'", ImageView.class);
    target.mAdClick = Utils.findRequiredViewAsType(source, R.id.ad_click, "field 'mAdClick'", LinearLayout.class);
    target.mAdSkipLoading = Utils.findRequiredViewAsType(source, R.id.ad_skip_loading, "field 'mAdSkipLoading'", ImageView.class);
    target.mAdIgnore = Utils.findRequiredViewAsType(source, R.id.ad_ignore, "field 'mAdIgnore'", FrameLayout.class);
    target.mSplashVideoFrame = Utils.findRequiredViewAsType(source, R.id.splash_video_frame, "field 'mSplashVideoFrame'", FrameLayout.class);
    target.mSplashVideoLayout = Utils.findRequiredViewAsType(source, R.id.splash_video_layout, "field 'mSplashVideoLayout'", RelativeLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mBannerView = null;
    target.mSplashView = null;
    target.mSkipReal = null;
    target.mGuideFragment = null;
    target.mAdClickSmall = null;
    target.mAdClick = null;
    target.mAdSkipLoading = null;
    target.mAdIgnore = null;
    target.mSplashVideoFrame = null;
    target.mSplashVideoLayout = null;

    view2131624232.setOnClickListener(null);
    view2131624232 = null;

    this.target = null;
  }
}
