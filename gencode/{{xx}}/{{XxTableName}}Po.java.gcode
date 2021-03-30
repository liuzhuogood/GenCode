package {{xx}}

/**
 {{comment}} 实体类
 author: {{author}}
 mail: {{mail}}
*/
public class {{TableName}}{
    {% for c in columns %}
        private {{c.dataType}} {{c.columnName}};  //{{c.comment}}

        /**{{c.comment}}*/
        public {{c.dataType}} get{{c.ColumnName}}(){return {{c.columnName}};};

        /**{{c.comment}}*/
        public void set{{c.ColumnName}}({{c.dataType}} {{c.columnName}}){this.{{c.columnName}}={{c.columnName}};};
    {% endfor %}

}
