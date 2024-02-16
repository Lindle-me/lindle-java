
/*
 *  author: M2K Developments
 *  github: https://github.com/m2kdevelopments
 */

package com.m2kdevelopments.lindle;

import com.m2kdevelopments.lindle.utils.API;

public class Lindle {
    final API api;

    Lindle(String apikey){
        this.api = new API(apikey);
    }

    public String getLinks(){
        return api.get("/api/links");
    }

    public String getFolders(){
        return api.get("/api/folders");
    }

    public String getSyncedBookmarks(){
        return api.get("/api/links/bookmarks/sync");
    }

    public String createLink(String name, String url, boolean favourite, String folderID){
        String body = "{"+
                """
                   "name":"%s",
                """.formatted(name) +
                """
                   "url":"%s",
                """.formatted(url) +

                """
                  "favourite":%b,
                """.formatted(favourite) +

                """
                   "folder":"%s"
                """.formatted(folderID) +
                "}";
        return api.post("/api/links", body);
    }

    public String createLink(String name, String url){
        return createLink(name, url, false, "");
    }

    public String createLink(String name, String url, boolean favourite){
        return createLink(name, url, favourite, "");
    }

    public String createFolder(String name,  boolean publicFolder){
        String body = "{"+
                """
                   "name":"%s",
                """.formatted(name) +
                """
                   "public":%b
                """.formatted(publicFolder) +
                "}";
        return api.post("/api/folders", body);
    }

    public String createFolder(String name){
        return createFolder(name, false);
    }

    public String updateLink(String id, String name, String url, boolean favourite, String folderID){
        String body = "{"+
                """
                   "name":"%s",
                """.formatted(name) +
                """
                   "url":"%s",
                """.formatted(url) +

                """
                   "favourite":%b,
                """.formatted(favourite) +

                """
                   "folder":"%s"
                """.formatted(folderID) +
               "}";
        return api.patch("/api/links/"+id, body);
    }

    public String updateLink(String id, String name, String url, boolean favourite){
        return updateLink(id, name, url, favourite, "");
    }

    public String updateLink(String id, String name, String url){
        return updateLink(id, name, url, false, "");
    }

    public String updateFolder(String id, String name,  boolean publicFolder){
        String body = "{"+
                """
                   "name":"%s",
                """.formatted(name) +
                """
                   "public":%b
                """.formatted(publicFolder) +
                "}";
        return api.patch("/api/folders/"+id, body);
    }

    public String updateFolder(String id, String name){
        return updateFolder(id, name, false);
    }


    public String deleteLink(String id){
        return api.delete("/api/links/"+id);
    }

    public String deleteFolder(String id){
        return api.delete("/api/folders/"+id);
    }

}
