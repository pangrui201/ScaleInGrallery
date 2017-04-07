# ScaleInGrallery


viewpager实现grallery左右滑动缩放透明度变化效果，点击左右两边图片响应点击事件。
技术点：

1.网上有很多viewpager+pageAdapter通过 android:clipChildren="true"属性实现的横滑效果，
但是viewPager里面左右没有被选中的view不会响应点击事件(viewpager拦截事件)。
为了解决这个问题本方案是viewPager+fragmentStatePageApdater+Fragment（fragment里面创建view）这样可以实现左右view点击事件

2.滑动缩放透明度特效使用viewpager.setPageTransformer方法。具体定义两种切换动画特效即可。
