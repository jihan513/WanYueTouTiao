// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;

public class BaseNewsActivity_ViewBinding<T extends BaseNewsActivity> implements Unbinder {
  protected T target;

  private View view2131624197;

  private View view2131624200;

  private View view2131624201;

  @UiThread
  public BaseNewsActivity_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.recyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'recyclerView'", RecyclerView.class);
    target.writeCommentLayout = Utils.findRequiredViewAsType(source, R.id.write_comment_layout, "field 'writeCommentLayout'", TextView.class);
    target.actionViewUp = Utils.findRequiredViewAsType(source, R.id.action_view_up, "field 'actionViewUp'", ImageView.class);
    target.actionViewComment = Utils.findRequiredViewAsType(source, R.id.action_view_comment, "field 'actionViewComment'", ImageView.class);
    target.actionCommentCount = Utils.findRequiredViewAsType(source, R.id.action_comment_count, "field 'actionCommentCount'", TextView.class);
    view = Utils.findRequiredView(source, R.id.action_commont_layout, "field 'actionCommontLayout' and method 'onClick'");
    target.actionCommontLayout = Utils.castView(view, R.id.action_commont_layout, "field 'actionCommontLayout'", FrameLayout.class);
    view2131624197 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    target.viewCommentLayout = Utils.findRequiredViewAsType(source, R.id.view_comment_layout, "field 'viewCommentLayout'", FrameLayout.class);
    view = Utils.findRequiredView(source, R.id.action_favor, "field 'actionFavor' and method 'onClick'");
    target.actionFavor = Utils.castView(view, R.id.action_favor, "field 'actionFavor'", ImageView.class);
    view2131624200 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.action_repost, "field 'actionRepost' and method 'onClick'");
    target.actionRepost = Utils.castView(view, R.id.action_repost, "field 'actionRepost'", ImageView.class);
    view2131624201 = view;
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

    target.recyclerView = null;
    target.writeCommentLayout = null;
    target.actionViewUp = null;
    target.actionViewComment = null;
    target.actionCommentCount = null;
    target.actionCommontLayout = null;
    target.viewCommentLayout = null;
    target.actionFavor = null;
    target.actionRepost = null;

    view2131624197.setOnClickListener(null);
    view2131624197 = null;
    view2131624200.setOnClickListener(null);
    view2131624200 = null;
    view2131624201.setOnClickListener(null);
    view2131624201 = null;

    this.target = null;
  }
}
