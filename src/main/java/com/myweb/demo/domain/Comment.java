package com.myweb.demo.domain;

import java.util.List;

public class Comment {
	/**
     * result : {"songs":[{"duration":135079,"rtype":0,"ftype":0,"artists":[{"img1v1Url":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"name":"梅林茂","alias":[],"id":160517,"albumSize":0,"picId":0}],"copyrightId":0,"album":{"publishTime":1001433600007,"size":29,"artist":{"img1v1Url":"http://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"name":"","alias":[],"id":0,"albumSize":0,"picId":0},"copyrightId":0,"name":"阴阳师 \u2015オリジナル・サウンドトラック","id":195808,"picId":1655864511431151,"status":1},"fee":0,"mvid":0,"name":"蜜虫","alias":[],"id":1944624,"status":0}],"order":["songs"]}
     * code : 200
     */
    private ResultEntity result;
    private int code;

    public void setResult(ResultEntity result) {
        this.result = result;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ResultEntity getResult() {
        return result;
    }

    public int getCode() {
        return code;
    }

    public class ResultEntity {
    	
        private List<Object> tracks;

        public void setTracks(List<Object> tracks) {
            this.tracks = tracks;
        }

        public List<Object> getTracks() {
            return tracks;
        }
    }
}
