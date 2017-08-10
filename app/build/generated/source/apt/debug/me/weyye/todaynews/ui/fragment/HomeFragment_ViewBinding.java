// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;
import me.weyye.todaynews.ui.view.colortrackview.ColorTrackTabLayout;

public class HomeFragment_ViewBinding<T extends HomeFragment> implements Unbinder {
  protected T target;

  private View view2131624087;

  private View view2131624089;

  @UiThread
  public HomeFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.feed_top_search_hint, "field 'feedTopSearchHint' and method 'onClick'");
    target.feedTopSearchHint = Utils.castView(view, R.id.feed_top_search_hint, "field 'feedTopSearchHint'", TextView.class);
    view2131624087 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.tab = Utils.findRequiredViewAsType(source, R.id.tab, "field 'tab'", ColorTrackTabLayout.class);
    view = Utils.findRequiredView(source, R.id.icon_category, "field 'iconCategory' and method 'onClick'");
    target.iconCategory = Utils.castView(view, R.id.icon_category, "field 'iconCategory'", ImageView.class);
    view2131624089 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.mVp = Utils.findRequiredViewAsType(source, R.id.vp, "field 'mVp'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.feedTopSearchHint = null;
    target.tab = null;
    target.iconCategory = null;
    target.mVp = null;

    view2131624087.setOnClickListener(null);
    view2131624087 = null;
    view2131624089.setOnClickListener(null);
    view2131624089 = null;

    this.target = null;
  }
}
