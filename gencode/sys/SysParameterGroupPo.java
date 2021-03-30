package sys

/**
 数据字典主表 实体类
 author: liuzhuo
 mail: liuzhuogood@foxmail.com
*/
public class ParameterGroup{
    
        private String groupCode;  //字典编号

        /**字典编号*/
        public String getGroupCode(){return groupCode;};

        /**字典编号*/
        public void setGroupCode(String groupCode){this.groupCode=groupCode;};
    
        private String groupName;  //字典名称

        /**字典名称*/
        public String getGroupName(){return groupName;};

        /**字典名称*/
        public void setGroupName(String groupName){this.groupName=groupName;};
    
        private String remark;  //备注

        /**备注*/
        public String getRemark(){return remark;};

        /**备注*/
        public void setRemark(String remark){this.remark=remark;};
    
        private String addDatetime;  //ADD_DATETIME

        /**ADD_DATETIME*/
        public String getAddDatetime(){return addDatetime;};

        /**ADD_DATETIME*/
        public void setAddDatetime(String addDatetime){this.addDatetime=addDatetime;};
    
        private String addOperator;  //ADD_OPERATOR

        /**ADD_OPERATOR*/
        public String getAddOperator(){return addOperator;};

        /**ADD_OPERATOR*/
        public void setAddOperator(String addOperator){this.addOperator=addOperator;};
    
        private String updateDatetime;  //UPDATE_DATETIME

        /**UPDATE_DATETIME*/
        public String getUpdateDatetime(){return updateDatetime;};

        /**UPDATE_DATETIME*/
        public void setUpdateDatetime(String updateDatetime){this.updateDatetime=updateDatetime;};
    
        private String updateOperator;  //UPDATE_OPERATOR

        /**UPDATE_OPERATOR*/
        public String getUpdateOperator(){return updateOperator;};

        /**UPDATE_OPERATOR*/
        public void setUpdateOperator(String updateOperator){this.updateOperator=updateOperator;};
    

}