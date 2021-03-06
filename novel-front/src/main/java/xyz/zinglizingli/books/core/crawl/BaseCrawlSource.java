package xyz.zinglizingli.books.core.crawl;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * 爬虫源
 * @author 11797
 */
@Data
public abstract class BaseCrawlSource {

    /**
     * 采集的小说最低评分配置
     * */
    @Value("${books.lowestScore}")
    private Float lowestScore;

    /**
     * 解析数据
     * */
    public abstract void parse();


    /**
     * 更新书籍
     * */
    public abstract void update();
}
