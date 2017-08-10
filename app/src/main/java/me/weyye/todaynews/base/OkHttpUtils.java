//package me.weyye.todaynews.base;
//
//import android.os.Handler;
//import android.os.Looper;
//
//import com.google.gson.internal.$Gson$Types;
//import com.squareup.okhttp.OkHttpClient;
//
//import java.lang.reflect.ParameterizedType;
//import java.lang.reflect.Type;
//import java.net.CookieManager;
//import java.net.CookiePolicy;
//import java.util.concurrent.TimeUnit;
//
///**
// * Created by jihan on 2017/8/10.
// * Description : OkHttp网络连接封装工具类
// */
//
//public class OkHttpUtils {
//    private static OkHttpUtils mInstance;
//    private OkHttpClient mOkHttpClient;
//    private Handler mDelivery;
//
//    private OkHttpUtils(){
//        mOkHttpClient = new OkHttpClient();
//        mOkHttpClient.setConnectTimeout(10, TimeUnit.SECONDS);
//        mOkHttpClient.setWriteTimeout(20,TimeUnit.SECONDS);
//        mOkHttpClient.setReadTimeout(30,TimeUnit.SECONDS);
//
//        mOkHttpClient.setCookieHandler(new CookieManager(null, CookiePolicy.ACCEPT_ORIGINAL_SERVER));
//        mDelivery = new Handler(Looper.getMainLooper());
//    }
//
//    private synchronized static OkHttpUtils getmInstance(){
//        if(mInstance==null){
//            mInstance = new OkHttpUtils();
//        }
//        return mInstance;
//    }
//
//    private void getReuest(String url,final ResultCallback callback){
//
//    }
//
//    /**
//     * http请求回调类,回调方法在UI线程中执行
//     * @param <T>
//     */
//    public static abstract class ResultCallback<T> {
//
//        Type mType;
//
//        public ResultCallback(){
//            mType = getSuperclassTypeParameter(getClass());
//        }
//
//        static Type getSuperclassTypeParameter(Class<?> subclass) {
//            Type superclass = subclass.getGenericSuperclass();
//            if (superclass instanceof Class) {
//                throw new RuntimeException("Missing type parameter.");
//            }
//            ParameterizedType parameterized = (ParameterizedType) superclass;
//            return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
//        }
//
//        /**
//         * 请求成功回调
//         * @param response
//         */
//        public abstract void onSuccess(T response);
//
//        /**
//         * 请求失败回调
//         * @param e
//         */
//        public abstract void onFailure(Exception e);
//    }
//
//}
