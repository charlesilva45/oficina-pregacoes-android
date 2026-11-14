package br.com.oficinadepregacoes;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.graphics.Color;
public class MainActivity extends Activity {
 private WebView view;
 @Override public void onCreate(Bundle state){super.onCreate(state);getWindow().setStatusBarColor(Color.rgb(6,19,38));getWindow().setNavigationBarColor(Color.rgb(6,19,38));view=new WebView(this);view.setBackgroundColor(Color.rgb(6,19,38));view.setWebViewClient(new WebViewClient());WebSettings s=view.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setAllowFileAccess(true);s.setAllowContentAccess(false);s.setAllowFileAccessFromFileURLs(false);s.setAllowUniversalAccessFromFileURLs(false);setContentView(view);view.loadUrl("file:///android_asset/index.html");}
 @Override public void onBackPressed(){if(view!=null&&view.canGoBack())view.goBack();else super.onBackPressed();}
 @Override protected void onDestroy(){if(view!=null)view.destroy();super.onDestroy();}
}
