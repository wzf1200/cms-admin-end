/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.interfaces;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public interface ICEmailConfig extends Serializable {

    /**
     * Setter for <code>cms.c_email_config.id</code>.
     */
    public void setId(String value);

    /**
     * Getter for <code>cms.c_email_config.id</code>.
     */
    @NotNull
    @Size(max = 40)
    public String getId();

    /**
     * Setter for <code>cms.c_email_config.smtp_host</code>.
     */
    public void setSmtpHost(String value);

    /**
     * Getter for <code>cms.c_email_config.smtp_host</code>.
     */
    @NotNull
    @Size(max = 45)
    public String getSmtpHost();

    /**
     * Setter for <code>cms.c_email_config.smtp_port</code>.
     */
    public void setSmtpPort(Integer value);

    /**
     * Getter for <code>cms.c_email_config.smtp_port</code>.
     */
    @NotNull
    public Integer getSmtpPort();

    /**
     * Setter for <code>cms.c_email_config.ssl_enable</code>. 1: 启用
0: 禁用
     */
    public void setSslEnable(Boolean value);

    /**
     * Getter for <code>cms.c_email_config.ssl_enable</code>. 1: 启用
0: 禁用
     */
    public Boolean getSslEnable();

    /**
     * Setter for <code>cms.c_email_config.email_account</code>.
     */
    public void setEmailAccount(String value);

    /**
     * Getter for <code>cms.c_email_config.email_account</code>.
     */
    @NotNull
    @Size(max = 60)
    public String getEmailAccount();

    /**
     * Setter for <code>cms.c_email_config.email_password</code>.
     */
    public void setEmailPassword(String value);

    /**
     * Getter for <code>cms.c_email_config.email_password</code>.
     */
    @NotNull
    @Size(max = 60)
    public String getEmailPassword();

    /**
     * Setter for <code>cms.c_email_config.enable</code>. 0: 禁用
1: 启用
是否启用配置
     */
    public void setEnable(Boolean value);

    /**
     * Getter for <code>cms.c_email_config.enable</code>. 0: 禁用
1: 启用
是否启用配置
     */
    public Boolean getEnable();

    /**
     * Setter for <code>cms.c_email_config.create_time</code>.
     */
    public void setCreateTime(Timestamp value);

    /**
     * Getter for <code>cms.c_email_config.create_time</code>.
     */
    public Timestamp getCreateTime();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ICEmailConfig
     */
    public void from(diamond.cms.server.model.jooq.tables.interfaces.ICEmailConfig from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ICEmailConfig
     */
    public <E extends diamond.cms.server.model.jooq.tables.interfaces.ICEmailConfig> E into(E into);
}
