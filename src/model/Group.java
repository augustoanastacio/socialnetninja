/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

public class Group implements Serializable{
	private String name;
        private ImageIcon profilePicture;
	private List<User> members;
	private List<User> memberRequests;
        private List<User> blacklist;
        private List<User> admins;
	private List<Post> posts;
        
        public Group(String name, User adm){
            this.members = new ArrayList();
            this.memberRequests = new ArrayList();
            this.admins = new ArrayList();
            this.posts = new ArrayList();
            
            this.name = name;
            this.admins.add(adm);
        }

	public String getName() {
            return name;
	}
	
	public void setName(String name) {
            this.name = name;
	}
	
	public List getMembers() {
            return members;
	}
	
	public void addMember(User newMember) {
            this.members.add(newMember);
	}
        
        public void removeMember(User user){
            this.members.remove(user);
        }
	
	public List getMemberRequests() {
            return memberRequests;
	}

	public void addMemberRequest(User memberRequest) {
            this.memberRequests.add(memberRequest);
	}
        
        public void removeMemberRequest(User user){
            this.memberRequests.remove(user);
        }
        
        public boolean isInMemberRequest(User user){
            return this.memberRequests.contains(user);
        }
        
        public boolean isMember(User user){
            return this.members.contains(user);
        }
        
        public boolean isAdmin(User user){
            return this.admins.contains(user);
        }
	
	public ImageIcon getProfilePicture() {
		return profilePicture;
	}
	
	public void setProfilePicture(ImageIcon picture) {
		this.profilePicture = picture;
	}
	
	public List getPosts() {
		return posts;
	}
	
	public void addPost(Post newPost) {
		this.posts.add(newPost);
	}
}
