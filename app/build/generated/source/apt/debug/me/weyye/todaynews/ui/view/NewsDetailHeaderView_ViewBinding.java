// Generated code from Butter Knife. Do not modify!
package me.weyye.todaynews.ui.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.weyye.todaynews.R;

public class NewsDetailHeaderView_ViewBinding<T extends NewsDetailHeaderView> implements Unbinder {
  protected T target;

  @UiThread
  public NewsDetailHeaderView_ViewBinding(T target, View source) {
    this.target = target;

    target.mTvTitle = Utils.findRequiredViewAsType(source, R.id.tvTitle, "field 'mTvTitle'", TextView.class);
    target.mIvAvatar = Utils.findRequiredViewAsType(source, R.id.ivAvatar, "field 'mIvAvatar'", CircleImageView.class);
    target.mTvUserName = Utils.findRequiredViewAsType(source, R.id.tvUserName, "field 'mTvUserName'", TextView.class);
    target.mTvDate = Utils.findRequiredViewAsType(source, R.id.tvDate, "field 'mTvDate'", TextView.class);
    target.mTvHtmlContent = Utils.findRequiredViewAsType(source, R.id.tvHtmlContent, "field 'mTvHtmlContent'", HtmlTextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.mTvTitle = null;
    target.mIvAvatar = null;
    target.mTvUserName = null;
    target.mTvDate = null;
    target.mTvHtmlContent = null;

    this.target = null;
  }
}
