const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmq8idy/",
            name: "ssmq8idy",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmq8idy/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "新冠肺炎服务预约微信小程序"
        } 
    }
}
export default base
