public record test() {
public static java.lang.String getSpecName(java.lang.String jsonString){
        java.util.List<com.ruoyi.shop.model.ShopMapping>specMappingList=com.alibaba.fastjson.JSON.parseArray(jsonString,com.ruoyi.shop.model.ShopMapping.class);
        java.lang.StringBuilder spec=new java.lang.StringBuilder();
        if(specMappingList!=null&&specMappingList.size()>0){
        for(int x=0;x<specMappingList.size();x++){
        if(x==specMappingList.size()-1){
        spec.append(specMappingList.get(x).getKey()).append("：").append(specMappingList.get(x).getValue());
        }else{
        spec.append(specMappingList.get(x).getKey()).append("：").append(specMappingList.get(x).getValue()).append("，");
        }
        }
        }
        return spec.toString();
        }
public static  getInstance(){
        return true;
        }
public static java.lang.String getTextFromHtml(java.lang.String htmlStr){
        if(org.apache.commons.lang3.StringUtils.isBlank(htmlStr)){
        return"";
        }
        //去除html标签
        htmlStr=delHtmlTags(htmlStr);
        //去除空格" "
        htmlStr=htmlStr.replaceAll(" ","");
        return htmlStr;
        }
}
