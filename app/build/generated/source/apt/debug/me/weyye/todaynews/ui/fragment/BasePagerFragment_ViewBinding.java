// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.view.ViewPager;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;
import me.weyye.todaynews.ui.view.colortrackview.ColorTrackTabLayout;

public class BasePagerFragment_ViewBinding<T extends BasePagerFragment> implements Unbinder {
  protected T target;

  @UiThread
  public BasePagerFragment_ViewBinding(T target, View source) {
    this.target = target;

    target.tab = Utils.findRequiredViewAsType(source, R.id.tab, "field 'tab'", ColorTrackTabLayout.class);
    target.vp = Utils.findRequiredViewAsType(source, R.id.vp, "field 'vp'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.tab = null;
    target.vp = null;

    this.target = null;
  }
}
