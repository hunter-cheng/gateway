1.安装好对应的nginx的服务器．
2.配置对应的反向代理
  反向代理配置：
  　location /proxy {
                rewrite ^.+proxy/?(.*)$ /$1 break;　　　　#重写路径
                include uwsgi_params;　　　　　　　　　　#参数
                proxy_pass http://127.0.0.1:8080;　　　　＃指定后台服务地址
	}
3.启动nginx服务器