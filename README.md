# gateway
　　　　　　　　　　　　　　　　　　＜maven 项目之spring使用说明＞

1.下载对应系统并选择包含maven　插件的eclipse,同时下载对应的maven程序
2.解压eclipse和maven,把maven解压路径加入path
3.建立本地仓库：创建任意位置文件夹，本次位置：/home/hunter/localRepository.
4.修改setting.xml:打开文件选择刚解压路径/conf/setting->添加<localRepository>/home/hunter/localRepository</localRepository>．其中本地仓库路路径
5.设置maven程序指向：运行eclipse,window->maven->installations->add->选择刚解压maven路径->勾选刚才添加的maven路径->apply.
  选中user setting->选择刚解压路径/conf/setting->update setting->ok．
6.导入项目
