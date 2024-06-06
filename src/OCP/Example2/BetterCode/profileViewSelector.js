const profileViewSelector = {
getProfileView(role){
switch(role){
case 'admin' = return<adminView/>;
case 'user' = return <user/>;
default return <stdview/>
}
}
}

export default profileViewSelector;