# MNCustomCamera
一个自定义相机，只拍摄相框中的图片（身份证拍摄等场景）

# 截图:
![image](https://github.com/maning0303/MNCustomCamera/blob/master/screenshots/mn_customcamera_screenshot_001.png)
![image](https://github.com/maning0303/MNCustomCamera/blob/master/screenshots/mn_customcamera_screenshot_002.png)

# 源码添加：
#### 直接拷贝整个module：cameralibrary，然后关联到你的项目就可以使用


# 代码使用:

### 1:打开拍照

``` java

    /**
     * 开启相机
     * 参数1: 上下文
     * 参数2: 请求码,用于onActivityResult
     */
    CameraUtil.getInstance().startCamera(this, 100);

```

### 1:拍照后回调

``` java

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(data == null){
            return;
        }
        if (requestCode == 100) {
            //图片的路径
            String img_path = data.getStringExtra(Constants.IntentKeyFilePath);
        }
    }

```


# 关于代码(特别感谢):
### 代码基于  [Android-CustomCamera](https://github.com/jinguangyue/Android-CustomCamera)  少量修改来的。


