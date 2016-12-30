package com.xiaojun.titlebarscroll;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity implements OnCheckedChangeListener , OnPageChangeListener {


	private HorizontalScrollView mHorizontalScrollView;
	private RadioGroup mRadioGroup;
	private RadioButton mRadioButton1;
	private RadioButton mRadioButton2;
	private RadioButton mRadioButton3;
	private RadioButton mRadioButton4;
	private RadioButton mRadioButton5;
	private ImageView  mImageView;
	private ViewPager mViewPager;
	private List<View> mList;
	private float mCurrentRadioButtonLeft;

	private String  name ="zhangxiaojun";
	private String pwd = "123";


	private String current = "2016";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		initView();
		initListener();
		initData();
	}

	private void initData() {
		mList=new ArrayList<View>();
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item0, null));
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item1, null));
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item2, null));
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item3, null));
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item4, null));
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item5, null));
		mList.add(getLayoutInflater().inflate(R.layout.viewpage_item0, null));
		mViewPager.setAdapter(new MyPageAdapter());
		mRadioButton1.setChecked(true);
		mViewPager.setCurrentItem(1);
		mCurrentRadioButtonLeft=getCurrentRadioButtonLeft();
	}

	private float getCurrentRadioButtonLeft() {
		if(mRadioButton1.isChecked()){
			return getResources().getDimension(R.dimen.rdo1);
		}else if(mRadioButton2.isChecked()){
			return getResources().getDimension(R.dimen.rdo2);
		}else if(mRadioButton3.isChecked()){
			return getResources().getDimension(R.dimen.rdo3);
		}else if(mRadioButton4.isChecked()){
			return getResources().getDimension(R.dimen.rdo4);
		}else if(mRadioButton5.isChecked()){
			return getResources().getDimension(R.dimen.rdo5);
		}
		return 0;
	}

	private void initListener() {
		mRadioGroup.setOnCheckedChangeListener(this);
		mViewPager.setOnPageChangeListener(this);
	}

	private void initView() {
		mHorizontalScrollView=(HorizontalScrollView) findViewById(R.id.mHorizontalScrollView);
		mRadioGroup=(RadioGroup) findViewById(R.id.mRadioGroup);
		mRadioButton1=(RadioButton) findViewById(R.id.mRadioButton1);
		mRadioButton2=(RadioButton) findViewById(R.id.mRadioButton2);
		mRadioButton3=(RadioButton) findViewById(R.id.mRadioButton3);
		mRadioButton4=(RadioButton) findViewById(R.id.mRadioButton4);
		mRadioButton5=(RadioButton) findViewById(R.id.mRadioButton5);
		mImageView=(ImageView) findViewById(R.id.mImageView);
		mViewPager=(ViewPager) findViewById(R.id.mViewPager);
	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		//��ĳһ��RadioButton��ѡ��ʱ�������ͼƬmImageView��ƽ�����ƶ�����Ӧ������
		 AnimationSet set=new AnimationSet(true);
		 TranslateAnimation translate;
		if(checkedId==R.id.mRadioButton1){
		/*	translate=new TranslateAnimation(mCurrentRadioButtonLeft, getResources().getDimension(R.dimen.rdo1), 0, 0);
			set.addAnimation(translate);
			set.setFillBefore(false);
			set.setFillAfter(true);
			set.setDuration(100);
			mImageView.startAnimation(set);*/
			LayoutParams params1=new LayoutParams((int)getResources().getDimension(R.dimen.rdo2), 4);
			params1.setMargins((int)getResources().getDimension(R.dimen.rdo1), 0, 0, 0);
			params1.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			mImageView.bringToFront();
			mImageView.setLayoutParams(params1);
			mViewPager.setCurrentItem(1);
		}else if(checkedId==R.id.mRadioButton2){
		/*	translate=new TranslateAnimation(mCurrentRadioButtonLeft, getResources().getDimension(R.dimen.rdo2), 0, 0);
			set.addAnimation(translate);
			set.setFillBefore(false);
			set.setFillAfter(true);
			set.setDuration(100);
			mImageView.startAnimation(set);*/
			LayoutParams params2=new LayoutParams((int)getResources().getDimension(R.dimen.rdo2), 4);
			params2.setMargins((int)getResources().getDimension(R.dimen.rdo2), 0, 0, 0);
			params2.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			mImageView.bringToFront();
			mImageView.setLayoutParams(params2);
			mViewPager.setCurrentItem(2);
		}else if(checkedId==R.id.mRadioButton3){
			/*translate=new TranslateAnimation(mCurrentRadioButtonLeft, getResources().getDimension(R.dimen.rdo3), 0, 0);
			set.addAnimation(translate);
			set.setFillBefore(false);
			set.setFillAfter(true);
			set.setDuration(100);
			mImageView.startAnimation(set);*/
			LayoutParams params3=new LayoutParams((int)getResources().getDimension(R.dimen.rdo2), 4);
			params3.setMargins((int)getResources().getDimension(R.dimen.rdo3), 0, 0, 0);
			params3.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			mImageView.bringToFront();
			mImageView.setLayoutParams(params3);
			mViewPager.setCurrentItem(3);
		}else if(checkedId==R.id.mRadioButton4){
			/*translate=new TranslateAnimation(mCurrentRadioButtonLeft, getResources().getDimension(R.dimen.rdo4), 0, 0);
			set.addAnimation(translate);
			set.setFillBefore(false);
			set.setFillAfter(true);
			set.setDuration(100);
			mImageView.startAnimation(set);*/
			LayoutParams params4=new LayoutParams((int)getResources().getDimension(R.dimen.rdo2), 4);
			params4.setMargins((int)getResources().getDimension(R.dimen.rdo4), 0, 0, 0);
			params4.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			mImageView.bringToFront();
			mImageView.setLayoutParams(params4);
			mViewPager.setCurrentItem(4);
		}else if(checkedId==R.id.mRadioButton5){
		/*	translate=new TranslateAnimation(mCurrentRadioButtonLeft, getResources().getDimension(R.dimen.rdo5), 0, 0);
			set.addAnimation(translate);
			set.setFillBefore(false);
			set.setFillAfter(true);
			set.setDuration(100);
			mImageView.startAnimation(set);*/
			LayoutParams params5=new LayoutParams((int)getResources().getDimension(R.dimen.rdo2), 4);
			params5.setMargins((int)getResources().getDimension(R.dimen.rdo5), 0, 0, 0);
			params5.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
			mImageView.bringToFront();
			mImageView.setLayoutParams(params5);
			mViewPager.setCurrentItem(5);
		}
		mCurrentRadioButtonLeft=getCurrentRadioButtonLeft();
		mHorizontalScrollView.smoothScrollTo((int) mCurrentRadioButtonLeft, 0);

	}
	
	
	

	
	
	@Override
	public void onPageScrollStateChanged(int arg0) {
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		
	}

	@Override
	public void onPageSelected(int position) {
		if(position==0){
			mViewPager.setCurrentItem(1);
		}else if(position==1){
			mRadioButton1.performClick();
		}else  if(position==2){
			mRadioButton2.performClick();
		}else  if(position==3){
			mRadioButton3.performClick();
		}else if(position==4){
			mRadioButton4.performClick();
		}else if(position==5){
			mRadioButton5.performClick();
		}else if(position==6){
			mViewPager.setCurrentItem(5);
		}
		
	}
	
	
	
	
	class MyPageAdapter extends PagerAdapter{

		@Override
		public int getCount() {
			return mList.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0==arg1;
		}
		
		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			((ViewPager)container).removeView(mList.get(position));
		}
		
		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			((ViewPager)container).addView(mList.get(position));
			return mList.get(position);
		}
	}
	
	

}
