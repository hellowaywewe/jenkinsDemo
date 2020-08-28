package common.util;

public class ResultUtil {
    private int stat;
    private String msg;
    private Object obj;

    public ResultUtil(int stat, String msg) {
        this.stat = stat;
        this.msg = msg;
    }

    public ResultUtil(int stat, String msg, Object obj) {
        this.stat = stat;
        this.msg = msg;
        this.obj = obj;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public ResultUtil success(int stat, String msg){
        return new ResultUtil(stat, msg);
    }

    public ResultUtil success(int stat, String msg, Object obj){
        return new ResultUtil(stat, msg, obj);
    }
}
