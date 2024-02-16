package com.m2kdevelopments.lindle.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

//https://restful-api.dev/
public class API {
  private  String apiKey;
  private final static String domain = "https://www.lindle.me";

  public API(String apiKey) {
    this.apiKey = apiKey;
  }

  public  void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public  String get(String subroute)  {

    URL url;
    HttpsURLConnection conn;
    try {
      url = new URL(domain+subroute);
      conn = (HttpsURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setDoOutput(true);
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setRequestProperty("User-Agent", "Mozilla/5.0");
      conn.setRequestProperty("Authorization", "Bearer "+apiKey);

      BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      StringBuilder response = new StringBuilder();

      while ((line = bf.readLine()) != null)
        response.append(line);
      return response.toString();
    } catch (Exception e) {
      e.printStackTrace();
      return "";
    }
  }

  public  String post(String subroute, String payload) {

    URL url;
    HttpsURLConnection conn;
    try {
      url = new URL(domain+subroute);
      conn = (HttpsURLConnection) url.openConnection();
      conn.setRequestMethod("POST");
      conn.setDoOutput(true);
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setRequestProperty("User-Agent", "Mozilla/5.0");
      conn.setRequestProperty("Authorization", "Bearer "+apiKey);

      DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
      dos.writeBytes(payload);

      BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      StringBuilder response = new StringBuilder();

      while ((line = bf.readLine()) != null)
        response.append(line);

      return response.toString();
    } catch (Exception e) {
      e.printStackTrace();
      return  "";
    }
  }

  public  String patch(String subroute, String payload) {
    URL url;
    HttpsURLConnection conn;
    try {
      url = new URL(domain+subroute);
      conn = (HttpsURLConnection) url.openConnection();
      conn.setRequestMethod("PATCH");
      conn.setDoOutput(true);
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setRequestProperty("User-Agent", "Mozilla/5.0");
      conn.setRequestProperty("Authorization", "Bearer "+apiKey);

      DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
      dos.writeBytes(payload);

      BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      StringBuilder response = new StringBuilder();

      while ((line = bf.readLine()) != null)
        response.append(line);

      return response.toString();
    } catch (Exception e) {
      e.printStackTrace();
      return  "";
    }
  }

  public  String delete(String subroute) {
    URL url;
    HttpsURLConnection conn;
    try {
      url = new URL(domain+subroute);
      conn = (HttpsURLConnection) url.openConnection();
      conn.setRequestMethod("DELETE");
      conn.setDoOutput(true);
      conn.setRequestProperty("Content-Type", "application/json");
      conn.setRequestProperty("User-Agent", "Mozilla/5.0");
      conn.setRequestProperty("Authorization", "Bearer "+apiKey);

      BufferedReader bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      StringBuilder response = new StringBuilder();

      while ((line = bf.readLine()) != null)
        response.append(line);
      return response.toString();
    } catch (Exception e) {
      e.printStackTrace();
      return "";
    }
  }

}
