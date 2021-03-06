/*捂脸猫FaceCat框架 v1.0
 1.创始人-矿洞程序员-上海宁米科技创始人-脉脉KOL-陶德 (微信号:suade1984);
 2.联合创始人-上海宁米科技创始人-袁立涛(微信号:wx627378127);
 3.联合创始人-河北思尔企业管理咨询有限公司合伙人-肖添龙(微信号:xiaotianlong_luu);
 4.联合开发者-陈晓阳(微信号:chenxiaoyangzxy)，助理-朱炜(微信号:cnnic_zhu);
 5.该框架开源协议为BSD，欢迎对我们的创业活动进行各种支持，欢迎更多开发者加入。
 包含C/C++,Java,C#,iOS,MacOS,Linux六个版本的图形和通讯服务框架。
 */
package facecat.topin.grid;

/*
* 布尔型单元格
*/
public class FCGridBoolCell extends FCGridCell {

    public FCGridBoolCell() {
    }

    public FCGridBoolCell(boolean value) {
        m_value = value;
    }

    protected boolean m_value;

    @Override
    public int compareTo(FCGridCell cell) {
        boolean value = getBool();
        boolean target = cell.getBool();
        if (value && !target) {
            return 1;
        } else if (!value && target) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean getBool() {
        return m_value;
    }

    @Override
    public double getDouble() {
        return m_value ? 1 : 0;
    }

    @Override
    public float getFloat() {
        return m_value ? 1 : 0;
    }

    @Override
    public int getInt() {
        return m_value ? 1 : 0;
    }

    @Override
    public long getLong() {
        return m_value ? 1 : 0;
    }

    @Override
    public String getString() {
        return m_value ? "true" : "false";
    }

    @Override
    public void setBool(boolean value) {
        m_value = value;
    }

    @Override
    public void setDouble(double value) {
        m_value = value > 0 ? true : false;
    }

    @Override
    public void setFloat(float value) {
        m_value = value > 0 ? true : false;
    }

    @Override
    public void setInt(int value) {
        m_value = value > 0 ? true : false;
    }

    @Override
    public void setLong(long value) {
        m_value = value > 0 ? true : false;
    }

    @Override
    public void setString(String value) {
        m_value = value.equals("true") ? true : false;
    }
}
