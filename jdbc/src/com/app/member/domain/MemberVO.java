package com.app.member.domain;

import java.util.Objects;
//모델 객체
public class MemberVO {	
	private Long id;
	private String memberEmail;
	private String memberPssword;
	private String memberName;
	private int memberAge;
	private int memberGender;
	private String createdDate;
	private String updateDate;
	
	public MemberVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberPssword() {
		return memberPssword;
	}

	public void setMemberPssword(String memberPssword) {
		this.memberPssword = memberPssword;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public int isMemberGender() {
		return memberGender;
	}

	public void setMemberGender(int memberGender) {
		this.memberGender = memberGender;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPssword=" + memberPssword
				+ ", memberName=" + memberName + ", memberAge=" + memberAge + ", memberGender=" + memberGender
				+ ", createdDate=" + createdDate + ", updateDate=" + updateDate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(createdDate, id, memberAge, memberEmail, memberGender, memberName, memberPssword,
				updateDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemberVO other = (MemberVO) obj;
		return Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
				&& memberAge == other.memberAge && Objects.equals(memberEmail, other.memberEmail)
				&& memberGender == other.memberGender && Objects.equals(memberName, other.memberName)
				&& Objects.equals(memberPssword, other.memberPssword) && Objects.equals(updateDate, other.updateDate);
	}
	
	
}
