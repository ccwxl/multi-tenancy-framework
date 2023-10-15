package cc.sofast.tenant.common.model;

/**
 * @author xielong.wang
 */
public enum DatasourceIso {

    /**
     * 独享数据源. 数据库连接
     */
    EXCLUSIVE,

    /**
     * 共享数据源. 数据库连接
     */
    SHARE,
}