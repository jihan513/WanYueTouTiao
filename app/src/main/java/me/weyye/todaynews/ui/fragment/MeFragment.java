package me.weyye.todaynews.ui.fragment;

import android.animation.Animator;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import me.weyye.todaynews.R;
import me.weyye.todaynews.base.BaseFragment;
import me.weyye.todaynews.model.Notice;
import me.weyye.todaynews.theme.colorUi.util.SharedPreferencesMgr;
import me.weyye.todaynews.ui.view.HeaderZoomLayout;
import me.weyye.todaynews.utils.ConstanceValue;

/**
 * Created by Administrator on 2016/11/17 0017.
 */
public class MeFragment extends BaseFragment {
    private LinearLayout ll_night_mode;
    private TextView txt_my_page_message;
    private ImageView ivBg;
    private HeaderZoomLayout zommLayout;

//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onActivityCreated(savedInstanceState);
//        Button denglu = (Button) getActivity().findViewById(R.id.button);
//        denglu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "我要登陆了", Toast.LENGTH_SHORT).show();
//            }
//        });
//        Button zhuce = (Button) getActivity().findViewById(R.id.button2);
//        zhuce.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "我要注册了", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }

    @Override
    protected View loadViewLayout(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_me, null);
    }

    @Override
    protected void bindViews(View view) {
        ll_night_mode = get(R.id.ll_night_mode);
//        ivBg = get(R.id.ivBg);
        zommLayout = get(R.id.zommLayout);
//        txt_my_page_message = get(R.id.txt_my_page_message);
    }

    @Override
    protected void processLogic() {
//        txt_my_page_message.setText(txt_my_page_message.getClass().getSimpleName());
//        zommLayout.setHeaderView(ivBg);
    }

    @Override
    protected void setListener() {
        ll_night_mode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (SharedPreferencesMgr.getInt(ConstanceValue.SP_THEME, ConstanceValue.THEME_LIGHT) == ConstanceValue.THEME_LIGHT) {
                    SharedPreferencesMgr.setInt(ConstanceValue.SP_THEME, ConstanceValue.THEME_NIGHT);
                    getActivity().setTheme(R.style.Theme_Night);
                } else {
                    SharedPreferencesMgr.setInt(ConstanceValue.SP_THEME, ConstanceValue.THEME_LIGHT);
                    getActivity().setTheme(R.style.Theme_Light);
                }
                final View rootView = getActivity().getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 14) {
                    rootView.setDrawingCacheEnabled(true);
                    rootView.buildDrawingCache(true);
                    final Bitmap localBitmap = Bitmap.createBitmap(rootView.getDrawingCache());
                    rootView.setDrawingCacheEnabled(false);
                    if (null != localBitmap && rootView instanceof ViewGroup) {
                        final View localView2 = new View(getActivity());
                        localView2.setBackgroundDrawable(new BitmapDrawable(getResources(), localBitmap));
                        ViewGroup.LayoutParams params = new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
                        ((ViewGroup) rootView).addView(localView2, params);
                        localView2.animate().alpha(0).setDuration(400).setListener(new Animator.AnimatorListener() {
                            @Override
                            public void onAnimationStart(Animator animation) {
                                post(new Notice(ConstanceValue.MSG_TYPE_CHANGE_THEME));
//                                ColorUiUtil.changeTheme(rootView, getTheme());
                            }

                            @Override
                            public void onAnimationEnd(Animator animation) {
                                ((ViewGroup) rootView).removeView(localView2);
                                localBitmap.recycle();
                            }

                            @Override
                            public void onAnimationCancel(Animator animation) {

                            }

                            @Override
                            public void onAnimationRepeat(Animator animation) {

                            }
                        }).start();
                    }
                } else {
                    post(new Notice(ConstanceValue.MSG_TYPE_CHANGE_THEME));
                }
            }
        });
    }
}
