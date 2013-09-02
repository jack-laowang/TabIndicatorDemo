package com.example.tabindicatordemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.tabindicatordemo.fragment.TestFragment;
import com.viewpagerindicator.TabPageIndicator;
public class MainActivity extends FragmentActivity {

	private static final String[] CONTENT = new String[] { "老子", "孔子", "庄子", "韩非子", "孙子", "孟子","墨子","荀子" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        FragmentPagerAdapter adapter = new GoogleMusicAdapter(getSupportFragmentManager());

        ViewPager pager = (ViewPager)findViewById(R.id.pager);
        pager.setAdapter(adapter);

        TabPageIndicator indicator = (TabPageIndicator)findViewById(R.id.indicator);
        indicator.setViewPager(pager);
	}

	 class GoogleMusicAdapter extends FragmentPagerAdapter {
	        public GoogleMusicAdapter(FragmentManager fm) {
	            super(fm);
	        }

	        @Override
	        public Fragment getItem(int position) {
//	        	Fragment ft = null;
//	        	switch (position) {
//	        	case 0:
//					ft = TestFragment.newInstance(CONTENT[position % CONTENT.length]);
//					break;
	//
//				default:
//					ft = TestFragment.newInstance(CONTENT[position % CONTENT.length]);
//					
//					
//					break;
//				}
				return  new TestFragment();
	        }

	        @Override
	        public CharSequence getPageTitle(int position) {
	            return CONTENT[position % CONTENT.length].toUpperCase();
	        }

	        @Override
	        public int getCount() {
	          return CONTENT.length;
	        }
	    }

}
