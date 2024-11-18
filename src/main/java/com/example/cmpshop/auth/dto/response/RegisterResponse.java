package com.example.cmpshop.auth.dto.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * Class này được sử dụng để trả dữ liệu từ server đến client.
 * Response sẽ trả về mã code và thông báo từ phía server
 *
 * - @Data: Sinh tự động các phương thức getter, setter, toString, equals và hashCode.
 * - @Builder: Hỗ trợ xây dựng đối tượng bằng Builder Pattern, giúp khởi tạo đối tượng một cách linh hoạt.
 * - @NoArgsConstructor: Tạo constructor không tham số, dùng để khởi tạo đối tượng mặc định.
 * - @AllArgsConstructor: Tạo constructor với đầy đủ các tham số, dùng khi cần khởi tạo với giá trị cụ thể.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterResponse {
    private int code ;
    private String message;
}