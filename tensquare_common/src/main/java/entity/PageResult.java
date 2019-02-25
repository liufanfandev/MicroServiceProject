package entity;

import java.util.List;

/**
 * 分页结果类
 */
public class PageResult<T> {
    private long total;
    private List<T> list;

    public PageResult() {
    }

    public PageResult(long total,List<T> list) {
        this.list = list;
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
