
# Issue 4 Viết tài liệu README.md
# Bài tập thực hành kiểm thử với JUnit

## Mô tả bài toán
Chương trình Java phân tích điểm số học sinh, bao gồm:
- Đếm số học sinh giỏi (điểm >= 8.0 và <= 10.0).
- Tính điểm trung bình của các điểm hợp lệ (0 ≤ điểm ≤ 10).

### Cấu trúc dự án
- `src/main/java/com/example/demo/`: Chứa mã nguồn (`StudentAnalyzer.java`).
- `src/test/java/com/example/demo/`: Chứa các test case JUnit (`StudentAnalyzerTest.java`).

### Yêu cầu môi trường
- Java 17 hoặc cao hơn.
- Maven 3.6.0 hoặc cao hơn.
- JUnit 5.10.2.

### Cách chạy chương trình
1. Clone repository:
   ```bash
   git clone https://github.com/TRANDINHNGUYEN-2004/unit-test-TranDinhNguyen
### ✅ Đo bao phủ kiểm thử

### Cách đo:
```bash
mvn clean test
### ✅ **TÓM TẮT TRẢ LỜI CHO BÀI TẬP**

```markdown
### 🔍 Phần 1: Phát hiện lỗi
- Sử dụng AI (ChatGPT) để phát hiện 3 vấn đề:
  1. Không xử lý điểm ngoài khoảng [0, 10] đầy đủ.
  2. Hàm trả về 0.0 khi toàn bộ input không hợp lệ mà không cảnh báo.
  3. Thiếu test case cho null input, precision, giá trị sát biên.

### 🔧 Phần 2: Xử lý
- Tạo 3 issue tương ứng trên GitHub.
- Sửa từng issue, commit rõ ràng, đóng issue sau khi merge.

### 📊 Phần 3: Đo bao phủ kiểm thử
- Dùng JaCoCo qua Maven.
- Kết quả đo:
  - StudentAnalyzer.java: 100% Line, 100% Branch coverage
  - Tất cả logic đều được kiểm thử kỹ lưỡng.