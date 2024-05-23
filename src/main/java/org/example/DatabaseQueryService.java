package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    public static void main(String[] args) {
        List<MaxProjectCountClient> maxProjectCountClients = findMaxProjectsClient();
        maxProjectCountClients.forEach(System.out::println);
        System.out.println("-".repeat(200));

        List<LongestProject> longestProjects = findLongestProject();
        longestProjects.forEach(System.out::println);
        System.out.println("-".repeat(200));

        List<MaxSalaryWorker> maxSalaryWorkers = findMaxSalaryWorker();
        maxSalaryWorkers.forEach(System.out::println);
        System.out.println("-".repeat(200));

        List<YoungestEldestWorker> youngestEldestWorker = findYongestEldestWorker();
        youngestEldestWorker.forEach(System.out::println);
        System.out.println("-".repeat(200));

        List<ProjectPrice> projectPrices = printProjectPrice();
        projectPrices.forEach(System.out::println);
        System.out.println("-".repeat(200));

    }
    public static List<MaxProjectCountClient> findMaxProjectsClient(){
        List<MaxProjectCountClient> result = new ArrayList<>();

        try(Statement statement = Database.getConnection().createStatement();) {
            ResultSet resultSet = statement.executeQuery(SQLReader.read("src/main/resources/sql/find_max_projects_client.sql"));
            while(resultSet.next()) {
                MaxProjectCountClient maxProjectCountClient = new MaxProjectCountClient(
                        resultSet.getString(1),
                        resultSet.getInt(2)
                );
                result.add(maxProjectCountClient);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<LongestProject> findLongestProject(){
        List<LongestProject> result = new ArrayList<>();

        try(Statement statement = Database.getConnection().createStatement();) {
            ResultSet resultSet = statement.executeQuery(SQLReader.read("src/main/resources/sql/find_longest_project.sql"));
            while(resultSet.next()) {
                LongestProject longestProject = new LongestProject(
                        resultSet.getString(1),
                        resultSet.getString(2)
                );
                result.add(longestProject);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<MaxSalaryWorker> findMaxSalaryWorker(){
        List<MaxSalaryWorker> result = new ArrayList<>();

        try(Statement statement = Database.getConnection().createStatement();) {
            ResultSet resultSet = statement.executeQuery(SQLReader.read("src/main/resources/sql/find_max_salary_worker.sql"));
            while(resultSet.next()) {
                MaxSalaryWorker maxSalaryWorker = new MaxSalaryWorker(
                        resultSet.getString(1),
                        resultSet.getInt(2)
                );
                result.add(maxSalaryWorker);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<YoungestEldestWorker> findYongestEldestWorker(){
        List<YoungestEldestWorker> result = new ArrayList<>();

        try(Statement statement = Database.getConnection().createStatement();) {
            ResultSet resultSet = statement.executeQuery(SQLReader.read("src/main/resources/sql/find_youngest_eldest_workers.sql"));
            while(resultSet.next()) {
                YoungestEldestWorker youngestEldestWorker = new YoungestEldestWorker(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );
                result.add(youngestEldestWorker);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<ProjectPrice> printProjectPrice(){
        List<ProjectPrice> result = new ArrayList<>();

        try(Statement statement = Database.getConnection().createStatement();) {
            ResultSet resultSet = statement.executeQuery(SQLReader.read("src/main/resources/sql/print_project_prices.sql"));
            while(resultSet.next()) {
                ProjectPrice projectPrice = new ProjectPrice(
                        resultSet.getInt(1),
                        resultSet.getInt(2)
                );
                result.add(projectPrice);
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
