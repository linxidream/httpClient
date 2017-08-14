package com.example.demo;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.junit.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by waijiaojun on 2017/8/14.
 */
public class HttpWriteSelf {
    @Test
    public void PostRequest(){
        //创建httpClient连接
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //创建提交方式
        HttpPost post=new HttpPost("http://blog.csdn.net/wangpeng047/article/details/19624529");
        //HttpGet get=new HttpGet("http://blog.csdn.net/wangpeng047/article/details/19624529");
        //创建参数队列
        List<BasicNameValuePair> value=new ArrayList<>();
        value.add(new BasicNameValuePair("name","value"));
        UrlEncodedFormEntity formatEntity;
        try {
            //设置参数的编码格式
            formatEntity=new UrlEncodedFormEntity(value,"UTF-8");
            //通过post请求将格式化过的实体放到post实体中
            post.setEntity(formatEntity);
            System.out.println("------------------------------------------------打印开始--------------------------------------------------");
            System.out.println("执行请求： " + post.getURI());
            //响应参数
            CloseableHttpResponse response = httpClient.execute(post);
            try{
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~打印响应头部~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                org.apache.http.Header[] header= response.getAllHeaders();
                for(int i=0;i<header.length;i++){
                    System.out.println(header[i]);
                }
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                //    System.out.println("响应内容: " + EntityUtils.toString(entity, "UTF-8"));
                    System.out.println("------------------------------------------------打印结束--------------------------------------------------");
                }
            }finally{
                response.close();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void getRequest(){
        //创建httpClient连接
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //创建提交方式
        HttpGet get=new HttpGet("http://blog.csdn.net/wangpeng047/article/details/19624529");

        try {
            System.out.println("------------------------------------------------打印开始--------------------------------------------------");
            System.out.println("执行请求： " + get.getURI());
            //响应参数
            CloseableHttpResponse response = httpClient.execute(get);
            try{
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~打印响应头部~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                org.apache.http.Header[] header= response.getAllHeaders();
                for(int i=0;i<header.length;i++){
                    System.out.println(header[i]);
                }
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    //    System.out.println("响应内容: " + EntityUtils.toString(entity, "UTF-8"));
                    System.out.println("------------------------------------------------打印结束--------------------------------------------------");
                }
            }finally{
                response.close();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void postDemo(){
        //创建httpClient连接
        CloseableHttpClient httpClient= HttpClients.createDefault();
        //创建提交方式
        HttpPost post=new HttpPost("http://blog.csdn.net/wangpeng047/article/details/19624529");

        try {
            System.out.println("------------------------------------------------打印开始--------------------------------------------------");
            System.out.println("执行请求： " + post.getURI());
            //响应参数
            CloseableHttpResponse response = httpClient.execute(post);
            try{
                System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~打印响应头部~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                org.apache.http.Header[] header= response.getAllHeaders();
                for(int i=0;i<header.length;i++){
                    System.out.println(header[i]);
                }
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    //    System.out.println("响应内容: " + EntityUtils.toString(entity, "UTF-8"));
                    System.out.println("------------------------------------------------打印结束--------------------------------------------------");
                }
            }finally{
                response.close();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
