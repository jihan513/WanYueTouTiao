// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;

public class ChannelDialogFragment_ViewBinding<T extends ChannelDialogFragment> implements Unbinder {
  protected T target;

  private View view2131624052;

  @UiThread
  public ChannelDialogFragment_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.icon_collapse, "method 'onClick'");
    view2131624052 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mRecyclerView = null;

    view2131624052.setOnClickListener(null);
    view2131624052 = null;

    this.target = null;
  }
}
