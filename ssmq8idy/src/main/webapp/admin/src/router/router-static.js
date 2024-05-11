import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import jiancejieguo from '@/views/modules/jiancejieguo/list'
    import news from '@/views/modules/news/list'
    import yiyuan from '@/views/modules/yiyuan/list'
    import fangyicuoshi from '@/views/modules/fangyicuoshi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import hesuanjiance from '@/views/modules/hesuanjiance/list'
    import hesuanyuyue from '@/views/modules/hesuanyuyue/list'
    import yimiaoxinxi from '@/views/modules/yimiaoxinxi/list'
    import config from '@/views/modules/config/list'
    import yimiaoyuyue from '@/views/modules/yimiaoyuyue/list'
    import jiezhongxinxi from '@/views/modules/jiezhongxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/jiancejieguo',
        name: '检测结果',
        component: jiancejieguo
      }
      ,{
	path: '/news',
        name: '疫情公告',
        component: news
      }
      ,{
	path: '/yiyuan',
        name: '医院',
        component: yiyuan
      }
      ,{
	path: '/fangyicuoshi',
        name: '防疫措施',
        component: fangyicuoshi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/hesuanjiance',
        name: '核酸检测',
        component: hesuanjiance
      }
      ,{
	path: '/hesuanyuyue',
        name: '核酸预约',
        component: hesuanyuyue
      }
      ,{
	path: '/yimiaoxinxi',
        name: '疫苗信息',
        component: yimiaoxinxi
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/yimiaoyuyue',
        name: '疫苗预约',
        component: yimiaoyuyue
      }
      ,{
	path: '/jiezhongxinxi',
        name: '接种信息',
        component: jiezhongxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
