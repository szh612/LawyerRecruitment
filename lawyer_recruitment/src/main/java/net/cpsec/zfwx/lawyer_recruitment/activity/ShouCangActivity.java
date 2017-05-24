package net.cpsec.zfwx.lawyer_recruitment.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import net.cpsec.zfwx.lawyer_recruitment.R;

public class ShouCangActivity extends Activity implements View.OnClickListener {
private ImageView iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shou_cang);
        initView();
    }

    private void initView() {
        iv_back= (ImageView) findViewById(R.id.iv_back);
        iv_back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
