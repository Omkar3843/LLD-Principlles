import profileViewSelector from "./profileViewSelector"

const UserProfile  = ({ user }) => {
const userProfile = profileViewSelector.getProfileView(user.role);
return <profileView user={user}>
}