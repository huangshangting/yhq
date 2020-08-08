
function search() {
    var urlInfo = $('#url_info');
    $.ajax({
        type: "GET",
        url: "http://51.nat123.fun:41777/search/qes",
        data: {searchValue:$("#searchText").val()},
        contentType: "application/json; charset=utf-8",
        success: function(data){
            var str;
            if (!data.urlStr) {
                str = "无优惠券或淘宝罢工，请再试试！";
            }else {
                str = '<a href=' + data.urlStr + '>点击领取优惠券</a>';
            }
            $('#url_info').html(str);
            $('#url_img').attr("src", data.urlImg);
        },
        error: function (data) {
            console.log(data)
            alert("请求失败！")
        }
    });
}