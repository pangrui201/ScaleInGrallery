
package com.grallery.pangrui1.grallery;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.grallery.pangrui1.grallery.view.AlphaPageTransformer;
import com.grallery.pangrui1.grallery.view.MultiViewPager;
import com.grallery.pangrui1.grallery.view.ScaleInTransformer;


public class PagerActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager);

        final MultiViewPager pager = (MultiViewPager) findViewById(R.id.pager);

        final FragmentStatePagerAdapter adapter = new FragmentStatePagerAdapter(getSupportFragmentManager()) {

            @Override
            public int getCount() {
                return 20;
            }

            @Override
            public Fragment getItem(int position) {
                return PageFragment.create(position);
            }

        };
        pager.setAdapter(adapter);
        pager.setPageTransformer(true,new AlphaPageTransformer(0.3f,new ScaleInTransformer(0.6f)));
        pager.setCurrentItem(2);
    }

}
