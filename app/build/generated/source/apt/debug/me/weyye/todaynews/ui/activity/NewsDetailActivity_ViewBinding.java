// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.activity;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.Override;
import me.weyye.todaynews.R;

public class NewsDetailActivity_ViewBinding<T extends NewsDetailActivity> extends BaseNewsActivity_ViewBinding<T> {
  private View view2131624069;

  @UiThread
  public NewsDetailActivity_ViewBinding(final T target, View source) {
    super(target, source);

    View view;
    view = Utils.findRequiredView(source, R.id.back_btn, "field 'backBtn' and method 'onBackClick'");
    target.backBtn = Utils.castView(view, R.id.back_btn, "field 'backBtn'", ImageView.class);
    view2131624069 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onBackClick(p0);
      }
    });
    target.title = Utils.findRequiredViewAsType(source, R.id.title, "field 'title'", TextView.class);
    target.shareBtn = Utils.findRequiredViewAsType(source, R.id.share_btn, "field 'shareBtn'", ImageView.class);
  }

  @Override
  public void unbind() {
    T target = this.target;
    super.unbind();

    target.backBtn = null;
    target.title = null;
    target.shareBtn = null;

    view2131624069.setOnClickListener(null);
    view2131624069 = null;
  }
}
